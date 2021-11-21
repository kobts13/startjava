public class Variable {
    public static void main(String[] args) {
        byte numberOfCores = 6;
        System.out.println("Количество ядер: " + numberOfCores);

        short numberOfLogicalProcessors = 12;
        System.out.println("Количество логических процессоров: " + numberOfLogicalProcessors);

        int numberOfStreams = 2_975;
        System.out.println("Количество потоков: " + numberOfStreams);

        long numberOfDescriptors = 99_421;
        System.out.println("Количество дескрипторов: " + numberOfDescriptors);

        float processorFrequency = 3.59f;
        System.out.println("Частота процессора: " + processorFrequency);

        double ramSize = 16.0;
        System.out.println("Размер оперативной памяти: " + ramSize);

        char systemDisk = 'C';
        System.out.println("Системный диск: " + systemDisk);

        boolean x64Based = true;
        System.out.println("64-разрядная операционная система: " + x64Based);
    }
}