package tp1;

public class SommeArgent {
    private int quantite;
    private String unite;


    // Part 1
    // public SommeArgent(int amount, String currency) {
    //     quantite = amount;
    //     unite = currency;
    // }

    // Part 2
    public SommeArgent add(SommeArgent m) throws UniteDistincteException {
        if (!m.getUnite().equals(this.getUnite())) {
            throw new UniteDistincteException(this, m);
        }
        return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
    }
    

    public int getQuantite() {
        return quantite;
    }

    public String getUnite() {
        return unite;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (anObject == null || getClass() != anObject.getClass()) return false;
        SommeArgent that = (SommeArgent) anObject;
        return quantite == that.quantite && unite.equals(that.unite);
    }

    public SommeArgent add(SommeArgent m) {
        return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
    }
}
