/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONArray
 */
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class CE$g
implements CE$h {
    public final void a(Bundle object, String charSequence, Object clazz) {
        Intrinsics.checkNotNullParameter(object, "bundle");
        Intrinsics.checkNotNullParameter(charSequence, "key");
        Intrinsics.checkNotNullParameter(clazz, "value");
        clazz = (JSONArray)clazz;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n3 = clazz.length();
        if (n3 == 0) {
            object.putStringArrayList((String)charSequence, arrayList);
            return;
        }
        n3 = clazz.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = clazz.get(i3);
            boolean bl2 = object2 instanceof String;
            if (bl2) {
                arrayList.add(object2);
                continue;
            }
            charSequence = new StringBuilder("Unexpected type in an array: ");
            clazz = object2.getClass();
            ((StringBuilder)charSequence).append(clazz);
            charSequence = ((StringBuilder)charSequence).toString();
            object = new IllegalArgumentException((String)charSequence);
            throw object;
        }
        object.putStringArrayList((String)charSequence, arrayList);
    }
}

