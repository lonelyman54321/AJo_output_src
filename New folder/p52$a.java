/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

public final class p52$a {
    public static p52_0 a(ArrayList arrayList) {
        p52_0 p52_02 = new p52_0();
        if (arrayList != null) {
            Bundle bundle = new Bundle();
            String string2 = "NOTIFICATION_LIST";
            bundle.putSerializable(string2, (Serializable)arrayList);
            p52_02.setArguments(bundle);
        }
        return p52_02;
    }
}

