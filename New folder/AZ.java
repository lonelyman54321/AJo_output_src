/*
 * Decompiled with CFR 0.152.
 */
public final class AZ
extends Enum {
    public static final /* synthetic */ AZ[] $VALUES;
    public static final /* enum */ AZ GET_DATA;
    public static final /* enum */ AZ GPO;
    public static final /* enum */ AZ READ_RECORD;
    public static final /* enum */ AZ SELECT;
    public final int cla;
    public final int ins;
    public final int p1;
    public final int p2;

    public static /* synthetic */ AZ[] $values() {
        AZ aZ = SELECT;
        aZ = READ_RECORD;
        aZ = GPO;
        aZ = GET_DATA;
        AZ[] aZArray = new AZ[]{aZ, aZ, aZ, aZ};
        return aZArray;
    }

    static {
        AZ aZ;
        AZ aZ2 = aZ;
        SELECT = aZ = new AZ("SELECT", 0, 0, 164, 4, 0);
        READ_RECORD = aZ2 = new AZ("READ_RECORD", 1, 0, 178, 0, 0);
        GPO = aZ2 = new AZ("GPO", 2, 128, 168, 0, 0);
        GET_DATA = aZ2 = new AZ("GET_DATA", 3, 128, 202, 0, 0);
        $VALUES = AZ.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public AZ(int n4, int n7) {
        void var6_4;
        void var5_3;
        void var2_-1;
        void var1_-1;
        this.cla = n4;
        this.ins = n7;
        this.p1 = var5_3;
        this.p2 = var6_4;
    }

    public static AZ valueOf(String string2) {
        return Enum.valueOf(AZ.class, string2);
    }

    public static AZ[] values() {
        return (AZ[])$VALUES.clone();
    }

    public int getCla() {
        return this.cla;
    }

    public int getIns() {
        return this.ins;
    }

    public int getP1() {
        return this.p1;
    }

    public int getP2() {
        return this.p2;
    }
}

