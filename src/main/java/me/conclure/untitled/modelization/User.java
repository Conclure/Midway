package me.conclure.untitled.modelization;

import java.util.UUID;

public class User {
  private final UUID uuid;

  public User(UUID uuid) {
    this.uuid = uuid;
  }

  public UUID uniqueId() {
    return this.uuid;
  }
}
