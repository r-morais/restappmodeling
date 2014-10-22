package com.benpot.model.util;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ClientAdapter implements JsonSerializer {

	@Override
	public JsonElement serialize(Object obj, Type arg1,
			JsonSerializationContext arg2) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		JsonObject jsonObject = new JsonObject();
		
		/*Client client = (Client) obj;		
		jsonObject.addProperty("id", client.getId());
		jsonObject.addProperty("name", client.getName());
		jsonObject.addProperty("cpf", client.getCpf());
		jsonObject.addProperty("email", client.getEmail());
		jsonObject.addProperty("registerDate", sdf.format(client.getRegisterDate()));
		jsonObject.addProperty("photo", client.getPhoto());
		jsonObject.addProperty("birthday", sdf.format(client.getBirthday()));*/

		return jsonObject;
	}

}
