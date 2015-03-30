package com.stormpz.rube;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stormpz.rube.joint.RUBEJoint;
import com.stormpz.rube.joint.RUBEJointDeserializer;

/**
 *
 */
public class RUBESceneLoader {

  private final Gson GSON = new GsonBuilder()
    .registerTypeAdapter(RUBEJoint.class, new RUBEJointDeserializer())
    .create();

  public RUBEScene load(String json) {
    return GSON.fromJson(json, RUBEScene.class);
  }

}
