public class Radio {
    private int currentStation;
    private int currentVolume;

    public void next() {
        if (currentStation != 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void loud() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void quiet() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
            return;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return;
        }
    }
}
