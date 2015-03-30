package com.stormpz.rube;

/**
 *
 */
public class RUBEFixture {

  private final float density;
  private final float friction;
  private final float restitution;

  private final String name;
  private final RUBEPolygon polygon;

  public RUBEFixture(float density, float friction, float restitution, String name, RUBEPolygon polygon) {
    this.density = density;
    this.friction = friction;
    this.restitution = restitution;
    this.name = name;
    this.polygon = polygon;
  }

  public float getDensity() {
    return density;
  }

  public float getFriction() {
    return friction;
  }

  public float getRestitution() {
    return restitution;
  }

  public String getName() {
    return name;
  }

  public RUBEPolygon getPolygon() {
    return polygon;
  }
}
