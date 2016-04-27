package buildingParts;


public abstract class BuildingPart {

    private Coordinates start;

    private Coordinates end;


    public BuildingPart(Coordinates start, Coordinates end) {
        this.start = start;
        this.end = end;
    }

    public Coordinates getStart() {
        return start;
    }

    public void setStart(Coordinates start) {
        this.start = start;
    }

    public Coordinates getEnd() {
        return end;
    }

    public void setEnd(Coordinates end) {
        this.end = end;
    }


    public abstract boolean equals(Object o);
}