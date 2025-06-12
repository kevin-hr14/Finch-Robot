 Finch f = new Finch();
        int t = 200;

        while (true) {
            int lL = f.getLeftLightSensor();
            int rL = f.getRightLightSensor();

            if (lL < t && rL < t) {
                f.setWheelVelocities(100, 100);
            } else if (lL > t && rL < t) {
                f.setWheelVelocities(50, 100);
            } else if (lL < t && rL > t) {
                f.setWheelVelocities(100, 50);
            } else {
                f.stopWheels();
                break;
            }

            f.sleep(100);
        }
