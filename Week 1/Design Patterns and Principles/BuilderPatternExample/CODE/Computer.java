public class Computer {

    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void displayConfig() {
        System.out.println("CPU : " + CPU);
        System.out.println("RAM : " + RAM);
        System.out.println("Storage : " + (storage != null ? storage : "Not Specified"));
        System.out.println("Graphics Card : " + (graphicsCard != null ? graphicsCard : "Not Specified"));
        System.out.println("Operating System : " + (operatingSystem != null ? operatingSystem : "Not specified"));
    }

    public static void main(String[] args) {
        Computer basic = new Computer.Builder("Intel i7", "16GB")
                            .build();

        Computer gaming = new Computer.Builder("AMD Ryzen 9", "32GB")
                            .setStorage("1TB SSD")
                            .setGraphicsCard("NVIDIA RTX 4080")
                            .setOperatingSystem("Windows 11")
                            .build();

        System.out.println("Basic Configuration:");
        basic.displayConfig();

        System.out.println("Gaming Configuration:");
        gaming.displayConfig();
    }
}

