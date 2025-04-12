/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import androidx.loader.content.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vv1
 */
public final class vv1_1
extends Uv1 {
    public final mu1_1 a;
    public final vv1$c_0 b;

    public vv1_1(mu1_1 object, rd3_0 object2) {
        this.a = object;
        object = vv1$c_0.c;
        Object object3 = "store";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object, string2);
        Wd0$a wd0$a = Wd0$a.b;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(wd0$a, "defaultCreationExtras");
        object3 = new pD3((rd3_0)object2, (E$b)object, wd0$a);
        object = vv1$c_0.class;
        object2 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        string2 = "<this>";
        object = sw0_0.a(object, string2, object, (String)object2, (String)object2);
        Intrinsics.checkNotNullParameter(object, string2);
        object2 = object.getQualifiedName();
        if (object2 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
            this.b = object = (vv1$c_0)((pD3)object3).a((yn1_2)object, (String)object2);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void b(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        ca3 ca32 = this.b.a;
        int n3 = ca32.j();
        if (n3 > 0) {
            int n4;
            printWriter.print(string2);
            printWriter.println("Loaders:");
            CharSequence charSequence = new StringBuilder();
            charSequence.append(string2);
            charSequence.append("    ");
            charSequence = charSequence.toString();
            for (int i3 = 0; i3 < (n4 = ca32.j()); ++i3) {
                vv1$a_0 vv1$a_0 = (vv1$a_0)ca32.k(i3);
                printWriter.print(string2);
                printWriter.print("  #");
                int n7 = ca32.g(i3);
                printWriter.print(n7);
                printWriter.print(": ");
                Object object = vv1$a_0.toString();
                printWriter.println((String)object);
                printWriter.print((String)charSequence);
                printWriter.print("mId=");
                n7 = vv1$a_0.l;
                printWriter.print(n7);
                printWriter.print(" mArgs=");
                object = vv1$a_0.m;
                printWriter.println(object);
                printWriter.print((String)charSequence);
                printWriter.print("mLoader=");
                object = vv1$a_0.n;
                printWriter.println(object);
                Object object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)charSequence);
                String string3 = "  ";
                ((StringBuilder)object2).append(string3);
                object2 = ((StringBuilder)object2).toString();
                ((a)object).dump((String)object2, fileDescriptor, printWriter, stringArray);
                object2 = vv1$a_0.p;
                if (object2 != null) {
                    printWriter.print((String)charSequence);
                    printWriter.print("mCallbacks=");
                    object2 = vv1$a_0.p;
                    printWriter.println(object2);
                    object2 = vv1$a_0.p;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append(string3);
                    string3 = stringBuilder.toString();
                    object2.getClass();
                    printWriter.print(string3);
                    string3 = "mDeliveredData=";
                    printWriter.print(string3);
                    boolean bl2 = ((vv1$b_0)object2).c;
                    printWriter.println(bl2);
                }
                printWriter.print((String)charSequence);
                printWriter.print("mData=");
                object2 = vv1$a_0.d();
                object = ((a)object).dataToString(object2);
                printWriter.println((String)object);
                printWriter.print((String)charSequence);
                object = "mStarted=";
                printWriter.print((String)object);
                n4 = vv1$a_0.c;
                if (n4 > 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    vv1$a_0 = null;
                }
                printWriter.println(n4 != 0);
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        Object object = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append((String)object);
        stringBuilder.append(" in ");
        object = this.a;
        ii1.b(stringBuilder, object);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}

