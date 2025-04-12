/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class C01 {
    public final int[] a;
    public final float[] b;

    public C01(int n3, int n4) {
        Object[] objectArray = new int[]{n3, n4};
        this.a = objectArray;
        objectArray = new float[2];
        objectArray[0] = (int)0.0f;
        objectArray[1] = (int)1.0f;
        this.b = objectArray;
    }

    public C01(int n3, int n4, int n7) {
        Object[] objectArray = new int[]{n3, n4, n7};
        this.a = objectArray;
        Object[] objectArray2 = objectArray = (Object[])new float[3];
        objectArray[0] = (int)0.0f;
        objectArray2[1] = (int)0.5f;
        objectArray2[2] = (int)1.0f;
        this.b = objectArray;
    }

    public C01(ArrayList arrayList, ArrayList arrayList2) {
        int n3 = arrayList.size();
        Object[] objectArray = new int[n3];
        this.a = objectArray;
        objectArray = new float[n3];
        this.b = objectArray;
        objectArray = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            Object[] objectArray2 = this.a;
            objectArray2[i3] = n4 = ((Integer)arrayList.get(i3)).intValue();
            objectArray2 = this.b;
            Float f5 = (Float)arrayList2.get(i3);
            float f6 = f5.floatValue();
            objectArray2[i3] = (int)f6;
        }
    }
}

