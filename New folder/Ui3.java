/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager$NameNotFoundException
 */
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public final class Ui3
implements Iterable {
    public final ArrayList a;
    public final Context b;

    public Ui3(Context context) {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
        this.b = context;
    }

    public final void a(ComponentName componentName) {
        PackageManager.NameNotFoundException nameNotFoundException2;
        Object object;
        block5: {
            object = this.b;
            ArrayList arrayList = this.a;
            int n3 = arrayList.size();
            componentName = dU1.b(object, componentName);
            while (componentName != null) {
                try {
                    arrayList.add(n3, componentName);
                    componentName = componentName.getComponent();
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException2) {
                    break block5;
                }
                componentName = dU1.b(object, componentName);
            }
            return;
        }
        object = new IllegalArgumentException(nameNotFoundException2);
        throw object;
    }

    public final PendingIntent c(int n3) {
        Intent[] intentArray = this.a;
        boolean bl2 = intentArray.isEmpty();
        if (!bl2) {
            Intent intent = new Intent[]{};
            intentArray = intentArray.toArray((T[])intent);
            Intent intent2 = intentArray[0];
            intent = new Intent(intent2);
            intentArray[0] = intent = intent.addFlags(0x1000C000);
            return PendingIntent.getActivities((Context)this.b, (int)101010, (Intent[])intentArray, (int)n3, null);
        }
        IllegalStateException illegalStateException = new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        throw illegalStateException;
    }

    public final void d() {
        Serializable serializable = this.a;
        boolean bl2 = ((ArrayList)serializable).isEmpty();
        if (!bl2) {
            bl2 = false;
            Intent intent = new Intent[]{};
            serializable = ((ArrayList)serializable).toArray((T[])intent);
            Serializable serializable2 = serializable[0];
            intent = new Intent((Intent)serializable2);
            int n3 = 0x1000C000;
            intent = intent.addFlags(n3);
            serializable[0] = intent;
            Context context = this.b;
            intent = null;
            boolean bl3 = t70.startActivities(context, (Intent[])serializable, null);
            if (!bl3) {
                n3 = ((Serializable)serializable).length + -1;
                serializable = serializable[n3];
                intent = new Intent((Intent)serializable);
                int n4 = 0x10000000;
                intent.addFlags(n4);
                context.startActivity(intent);
            }
            return;
        }
        serializable = new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        throw serializable;
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }
}

