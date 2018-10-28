package pl.sdacademy.designpattterns.duck;

public class DuckEgg {
    private final Double yolkWeight;
    private final Double whitewheigt;
    private final Double totalWeight;

    private DuckEgg(Double yolkWeight, Double whitewheigt, Double totalWeight) {
        this.yolkWeight = yolkWeight;
        this.whitewheigt = whitewheigt;
        this.totalWeight = totalWeight;
    }

    public Double getYolkWeight() {
        return yolkWeight;
    }

    public Double getWhitewheigt() {
        return whitewheigt;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "DuckEgg{" +
                "yolkWeight=" + yolkWeight +
                ", whitewheigt=" + whitewheigt +
                ", totalWeight=" + totalWeight +
                '}';
    }

    public static class Bilder{
        private Double yolkWeight;

        public void setYolkWeight(Double yoldWeight){
            this.yolkWeight = yoldWeight;

        }

        public DuckEgg build() {
            Double calculatedYolkWeight = yolkWeight != null ? yolkWeight : 0D;

            Double whiteWeight = calculateWhiteWeight (calculatedYolkWeight);
            Double membraneWeight = calculatedMembraneWeight (calculatedYolkWeight, whiteWeight);
            Double shellWeight = calculatedShellWeight(whiteWeight);
            Double totalWeight = yolkWeight + whiteWeight + shellWeight + membraneWeight;

            return new DuckEgg(yolkWeight, whiteWeight, totalWeight);

        }

        private Double calculatedShellWeight(Double whiteWeight) {
//            Double shellWeight = whiteWeight * 0.07;
//            if(shellWeight < 3D){
//                shellWeight = 3D;
//            }

            return Math.max(whiteWeight * 0.07, 3D);
        }

        private Double calculatedMembraneWeight(Double calculatedYolkWeight, Double whiteWeight) {
            return (calculatedYolkWeight + whiteWeight) * 0.005;
        }

        private Double calculateWhiteWeight(Double calculatedYolkWeight) {
//            Double whiteWeight = calculatedYolkWeight * 1.2;
//                if(whiteWeight < 31){
//                    whiteWeight = 31D;
//                }
            return Math.max(calculatedYolkWeight * 1.2, 31D);
        }
    }

}
