package tp1;

import java.util.HashMap;

public class PorteMonnaie {
    private HashMap<String, Integer> contenu;

    public HashMap<String, Integer> getContenu() {
        return contenu;
    }

    public PorteMonnaie() {
        contenu = new HashMap<>();
    }

    public void ajouteSomme(SommeArgent sa) {
        String unite = sa.getUnite();
        int quantite = sa.getQuantite();
        contenu.put(unite, contenu.getOrDefault(unite, 0) + quantite);
    }

    @Override
    public String toString() {
        StringBuilder contenuStr = new StringBuilder("Contenu du porte-monnaie :\n");
        for (String unite : contenu.keySet()) {
            contenuStr.append(contenu.get(unite)).append(" ").append(unite).append("\n");
        }
        return contenuStr.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PorteMonnaie that = (PorteMonnaie) obj;
        return contenu.equals(that.contenu);
    }
}
