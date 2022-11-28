package ru.malyshev.renderfarm.dto;

import ru.malyshev.renderfarm.model.Task;
import ru.malyshev.renderfarm.model.User;

public record TaskDto(String title, String description, long userId) {

}
