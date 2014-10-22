package com.benpot.model.helper;

import java.util.Map;
import java.util.TreeMap;

public class FixedComboHelper {

	private static Map<String, String> customerTypeMap;  
	
	private static Map<String, String> stateMap;
	
	public static Map<String, String> getCustomerTypeMap() {
		customerTypeMap = new TreeMap<String, String>();
		customerTypeMap.put("1", "Coworkers");
		customerTypeMap.put("2", "Estudantes");
		customerTypeMap.put("3", "Universitários");
		customerTypeMap.put("4", "Empresas");
		
		return customerTypeMap;
	}
	
	public static Map<String, String> getStateMap() {
		stateMap = new TreeMap<String, String>();
		stateMap.put("Acre", "Acre");
		stateMap.put("Alagoas", "Alagoas");
		stateMap.put("Amapá", "Amapá");
		stateMap.put("Amazonas", "Amazonas");
		stateMap.put("Bahia", "Bahia");
		stateMap.put("Ceará", "Ceará");
		stateMap.put("Distrito Federal ", "Distrito Federal ");
		stateMap.put("Espírito Santo", "Espírito Santo");
		stateMap.put("Goiás", "Goiás");
		stateMap.put("Maranhão", "Maranhão");
		stateMap.put("Mato Grosso", "Mato Grosso");
		stateMap.put("Mato Grosso do Sul", "Mato Grosso do Sul");
		stateMap.put("Minas Gerais", "Minas Gerais");
		stateMap.put("Pará", "Pará");
		stateMap.put("Paraíba", "Paraíba");
		stateMap.put("Paraná", "Paraná");
		stateMap.put("Pernambuco", "Pernambuco");
		stateMap.put("Piauí", "Piauí");
		stateMap.put("Rio de Janeiro", "Rio de Janeiro");
		stateMap.put("Rio Grande do Norte", "Rio Grande do Norte");
		stateMap.put("Rio Grande do Sul", "Rio Grande do Sul");
		stateMap.put("Rondônia", "Rondônia");	
		stateMap.put("Roraima", "Roraima");
		stateMap.put("Santa Catarina", "Santa Catarina");	
		stateMap.put("São Paulo", "São Paulo");
		stateMap.put("Sergipe", "Sergipe");
		stateMap.put("Tocantins ", "Tocantins ");	
		
		return stateMap;
	}
}
