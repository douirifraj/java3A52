package tn.esprit.gestionzoo.exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Âge d’animal invalide : l’âge ne peut pas être négatif.");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}