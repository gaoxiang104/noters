package pers.xgo.onjava.chapter10_interfaces;

sealed interface Employee permits CLevel, Programmer {}

record CLevel(String type) implements Employee {}
record Programmer(String type) implements Employee {}

public class SealedRecord {
}
