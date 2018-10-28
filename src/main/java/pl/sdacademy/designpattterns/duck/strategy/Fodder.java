package pl.sdacademy.designpattterns.duck.strategy;

public class Fodder {

    private Integer cornGrams;
    private Integer wheatGrams;
    private Integer oatGrams;
    private Integer triticalGrams;
    private Boolean minerals;
    private Boolean vitamins;

    private Fodder(Builder builder) {
        cornGrams = builder.cornGrams;
        wheatGrams = builder.wheatGrams;
        oatGrams = builder.oatGrams;
        triticalGrams = builder.triticalGrams;
        minerals = builder.minerals;
        vitamins = builder.vitamins;
    }

    public static Builder builder(Integer cornGrams, Integer wheatGrams) {
        //validation
        if (cornGrams == null || cornGrams < 0) {
            throw new IllegalAccessError("Corn must be provided");
        }
        if (wheatGrams == null || wheatGrams < 0) {
            throw new IllegalAccessError("Wheat must be provided");
        }

        return new Builder(cornGrams, wheatGrams);
    }

    public Integer getCornGrams() {
        return cornGrams;
    }

    public Integer getWheatGrams() {
        return wheatGrams;
    }

    public Integer getOatGrams() {
        return oatGrams;
    }

    public Integer getTriticalGrams() {
        return triticalGrams;
    }

    public Boolean getMinerals() {
        return minerals;
    }

    public Boolean getVitamins() {
        return vitamins;
    }

    public static class Builder {
        private Integer cornGrams;
        private Integer wheatGrams;
        private Integer oatGrams;
        private Integer triticalGrams;
        private Boolean minerals;
        private Boolean vitamins;

        private Builder(Integer cornGrams, Integer wheatGrams) {
            this.cornGrams = cornGrams;
            this.wheatGrams = wheatGrams;
        }

        public Builder oatGrams(Integer oatGrams) {
            this.oatGrams = oatGrams;
            return this;
        }

        public Builder triticalGrams(Integer triticalGrams) {
            this.triticalGrams = triticalGrams;
            return this;
        }

        public Builder minerals(Boolean minerals) {
            this.minerals = minerals;
            return this;
        }

        public Builder trivitaminsticalGrams(Boolean vitamins) {
            this.vitamins = vitamins;
            return this;
        }


        public Fodder build() {
            return new Fodder(this);

        }


    }
}
