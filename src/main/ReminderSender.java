package main;

import java.util.List;

/**
 *
 * @author Armel DREY
 */
public class ReminderSender {
    public static void sendReminders(int eventId) {
        // Récupérer la liste des utilisateurs inscrits à l'événement
        List<String> recipients = getUsersForEvent(eventId);

        // Envoyer un rappel par e-mail à chaque utilisateur
        for (String recipient : recipients) {
          String subject = "Rappel : Événement à venir";
          String message = "Vous êtes inscrit à l'événement #" + eventId + " qui commence dans 30 minutes.";

          sendEmail(recipient, subject, message);
        }
     }

    private static List<String> getUsersForEvent(int eventId) {
      // Implémentation de la méthode pour récupérer les utilisateurs inscrits à un événement
        System.out.println("getUsersForEvent");
        return null;
    }
    
    private static void sendEmail(String recipient, String subject, String message) {
        // Implémentation de la méthode pour envoyer un e-mail
        System.out.println("sendEmail");
    }
}
