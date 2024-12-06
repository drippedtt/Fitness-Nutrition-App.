class DeviceSync {
    private String deviceId;
    private String deviceName;

    public DeviceSync(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }

    public void syncData(User user) {
        System.out.println("Synchronizing data from " + deviceName + " for user " + user.getName());
        System.out.println("Data synchronized successfully!");
    }
}

