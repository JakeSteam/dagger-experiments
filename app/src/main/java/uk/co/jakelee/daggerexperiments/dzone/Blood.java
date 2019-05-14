package uk.co.jakelee.daggerexperiments.dzone;

public abstract class Blood {
    public abstract String getKindOfBlood();
}

class A_Blood extends Blood {
    @Override
    public String getKindOfBlood() {
        return "A";
    }
}

class B_Blood extends Blood {
    @Override
    public String getKindOfBlood() {
        return "B";
    }
}

class AB_Blood extends Blood {
    @Override
    public String getKindOfBlood() {
        return "AB";
    }
}

class O_Blood extends Blood {
    @Override
    public String getKindOfBlood() {
        return "O";
    }
}
