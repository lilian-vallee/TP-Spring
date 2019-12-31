package com.ENSIM.TP.tp5.controller;

import com.ENSIM.TP.tp5.model.Adresse;
import com.ENSIM.TP.tp5.model.DarkSky.DarkSky;
import com.ENSIM.TP.tp5.model.etatLab.Etatlab;
import com.ENSIM.TP.tp5.model.etatLab.Geometry;
import com.ENSIM.TP.tp5.model.etatLab.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Controller
public class meteoController
{
    private Etatlab etatlab;
    private DarkSky darkSky;

    private String etatLabApiAddr = "https://api-adresse.data.gouv.fr/search/?q=";
    private String darkApiAddr = "https://api.darksky.net/forecast/96f71f26a80dac606780560744513905/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/adresse")
    public String adresseForm(Model model) {
        model.addAttribute("adresse", new Adresse());
        return "adresse";
    }

    @PostMapping("/adresse")
    public String adresseSubmit(Adresse adresse, Model model)
    {
        etatlab = restTemplate.getForObject(etatLabApiAddr + adresse.getAdresse() + "&postcode="+ adresse.getCodePostal(), Etatlab.class);

        Properties properties = etatlab.getFeatures().get(0).getProperties();
        Geometry geometry = etatlab.getFeatures().get(0).getGeometry();

        List<Double> coords = geometry.getCoordinates();

        model.addAttribute("label", properties.getLabel());

        darkSky = restTemplate.getForObject(darkApiAddr + geometry.getCoordinates().get(0) + "," + geometry.getCoordinates().get(1) + "?exclude=minutely,hourly?units=si", DarkSky.class);

        model.addAttribute("currentTemperature", darkSky.getCurrently().getTemperature());
        model.addAttribute("currentHumidity", darkSky.getCurrently().getHumidity());

        model.addAttribute("todayTemperatureMax", darkSky.getDaily().getData().get(0).getTemperatureMax());
        model.addAttribute("todayTemperatureMin", darkSky.getDaily().getData().get(0).getTemperatureMin());
        model.addAttribute("todayPrecip", darkSky.getDaily().getData().get(0).getPrecipType());
        model.addAttribute("todayPrecipProbability", darkSky.getDaily().getData().get(0).getPrecipProbability());

        return "meteo";
    }

}
