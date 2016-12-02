package com.hack.hackathon;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;


public class Que22 {

	 @SuppressWarnings("unchecked")
	public static void main(String[] args) {

			JSONParser parser = new JSONParser();

			try {
				Gson gson = new Gson();
				Object obj = parser.parse(new FileReader("/home/consultadd/Downloads/Hackathon_dec2016/sample.json"));

				System.out.println(obj);
				jsonJava j = gson.fromJson(obj.toString(), jsonJava.class);
				
				//jsonJava d
				
				j.getFeatureConfigs().getFeatures().get(2).getFirewallRules().getFirewallRules().get(0).getApplication().getService().get(0).setProtocol("udp");
				System.out.println(j.getFeatureConfigs().getFeatures().get(5).getBgp().getRedistribution().getRules().getRules().get(0).getFrom().isOspf());		
				j.getFeatureConfigs().getFeatures().get(5).getBgp().getRedistribution().getRules().getRules().get(0).getFrom().isOspf();
				int KeepAliveTimer=j.getFeatureConfigs().getFeatures().get(5).getBgp().getBgpNeighbours().getBgpNeighbours().get(0).getKeepAliveTimer();
				int HoldDownTimer=j.getFeatureConfigs().getFeatures().get(5).getBgp().getBgpNeighbours().getBgpNeighbours().get(0).getHoldDownTimer();
				int NewHoldDownTimer=KeepAliveTimer+HoldDownTimer;
				 j.getFeatureConfigs().getFeatures().get(5).getBgp().getBgpNeighbours().getBgpNeighbours().get(0).setHoldDownTimer(NewHoldDownTimer);
				j.getVnics().getVnics().get(0).setPortgroupName("EXT_VLAN_201b");
				 String resultingJson = gson.toJson(j);
				System.out.println(resultingJson);				
				try (FileWriter file = new FileWriter("/home/consultadd/Downloads/Hackathon_dec2016/sample.json")) {
					file.write(resultingJson);
					System.out.println("Successfully Copied JSON Object to File...");
					System.out.println("\nJSON Object: " + resultingJson);
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
 } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
