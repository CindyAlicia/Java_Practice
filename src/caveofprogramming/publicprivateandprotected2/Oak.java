package caveofprogramming.publicprivateandprotected2;

public class Oak extends Plant{
    public Oak() {
        // Won't work --- type is private.
        //type = "tree";

        this.name = "Oak";

        // This works --- size is protected, Oak is a subclass of plant.
        this.size = "Large";

        // No access specifier --- works because Plant and Oak in the same package.
        this.height = 10;
    }
}
