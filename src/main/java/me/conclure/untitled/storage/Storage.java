package me.conclure.untitled.storage;

import me.conclure.untitled.modelization.User;

import java.util.UUID;

public interface Storage {

  User loadUser(UUID uniqueId);

  void saveUser(User user);

}
