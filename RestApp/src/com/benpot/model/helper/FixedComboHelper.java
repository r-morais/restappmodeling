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
		customerTypeMap.put("3", "Universit�rios");
		customerTypeMap.put("4", "Empresas");
		
		return customerTypeMap;
	}
	
	public static Map<String, String> getStateMap() {
		stateMap = new TreeMap<String, String>();
		stateMap.put("Acre", "Acre");
		stateMap.put("Alagoas", "Alagoas");
		stateMap.put("Amap�", "Amap�");
		stateMap.put("Amazonas", "Amazonas");
		stateMap.put("Bahia", "Bahia");
		stateMap.put("Cear�", "Cear�");
		stateMap.put("Distrito Federal ", "Distrito Federal ");
		stateMap.put("Esp�rito Santo", "Esp�rito Santo");
		stateMap.put("Goi�s", "Goi�s");
		stateMap.put("Maranh�o", "Maranh�o");
		stateMap.put("Mato Grosso", "Mato Grosso");
		stateMap.put("Mato Grosso do Sul", "Mato Grosso do Sul");
		stateMap.put("Minas Gerais", "Minas Gerais");
		stateMap.put("Par�", "Par�");
		stateMap.put("Para�ba", "Para�ba");
		stateMap.put("Paran�", "Paran�");
		stateMap.put("Pernambuco", "Pernambuco");
		stateMap.put("Piau�", "Piau�");
		stateMap.put("Rio de Janeiro", "Rio de Janeiro");
		stateMap.put("Rio Grande do Norte", "Rio Grande do Norte");
		stateMap.put("Rio Grande do Sul", "Rio Grande do Sul");
		stateMap.put("Rond�nia", "Rond�nia");	
		stateMap.put("Roraima", "Roraima");
		stateMap.put("Santa Catarina", "Santa Catarina");	
		stateMap.put("S�o Paulo", "S�o Paulo");
		stateMap.put("Sergipe", "Sergipe");
		stateMap.put("Tocantins ", "Tocantins ");	
		
		return stateMap;
	}
}
