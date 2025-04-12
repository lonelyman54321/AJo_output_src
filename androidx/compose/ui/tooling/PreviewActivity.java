/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.os.Bundle
 */
package androidx.compose.ui.tooling;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import kotlin.text.StringsKt;

public final class PreviewActivity
extends ComponentActivity {
    public final void onCreate(Bundle object) {
        Object[] objectArray;
        super.onCreate((Bundle)object);
        object = this.getApplicationInfo();
        int n3 = ((ApplicationInfo)object).flags & 2;
        if (n3 == 0) {
            this.finish();
            return;
        }
        object = this.getIntent();
        if (object != null && (object = object.getStringExtra((String)(objectArray = "composable"))) != null) {
            int n4 = 46;
            String string2 = StringsKt.k0((String)object, (char)n4);
            object = StringsKt.g0((char)n4, (String)object, (String)object);
            objectArray = this.getIntent();
            String string3 = "parameterProviderClassName";
            objectArray = objectArray.getStringExtra(string3);
            boolean bl2 = true;
            if (objectArray != null) {
                try {
                    objectArray = Class.forName((String)objectArray);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    n4 = 0;
                    objectArray = null;
                }
                Object object2 = this.getIntent();
                String string4 = "parameterProviderIndex";
                int n7 = -1;
                int bl3 = object2.getIntExtra(string4, n7);
                objectArray = uy2_0.b(objectArray, bl3);
                boolean bl4 = objectArray.length;
                if (bl4 > bl2) {
                    object2 = new jy2_1(string2, (String)object, objectArray);
                    n4 = -861939235;
                    object = new u10(n4, object2, bl2);
                    f10.a(this, (u10)object);
                } else {
                    object2 = new ky2_2(string2, (String)object, objectArray);
                    n4 = -1901447514;
                    object = new u10(n4, object2, bl2);
                    f10.a(this, (u10)object);
                }
            } else {
                objectArray = new fy2_2(string2, (String)object);
                int n7 = -840626948;
                object = new u10(n7, objectArray, bl2);
                f10.a(this, (u10)object);
            }
        }
    }
}

