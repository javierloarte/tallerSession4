package factoryDevices;

public class FactoryDevices {

    public static IDevices make(String typeDevice){
        IDevices device;

        switch (typeDevice.toLowerCase()){
            case "android":
                device = new Android();
                break;
            case "ios":
                device = new IOS();
                break;
            case "cloud":
                device = new CloudDevices();
                break;
            default:
                device = new Android();
                break;
        }
        return device;
    }

}
