/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.widget.Toast
 */
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.ril.ajio.data.repo.NewPDPRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zA
 */
public final class za_2
implements o60_0,
bx0_2,
w3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ za_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public void a(Object object) {
        object = (Boolean)object;
        boolean n3 = (Boolean)object;
        String[] stringArray = (String[])this.b;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(stringArray, string2);
        if (n3) {
            object = stringArray.p2();
            stringArray = stringArray.p2().getResources();
            object.grant(stringArray);
        } else {
            boolean bl2;
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 23;
            if (n4 >= n7 && (bl2 = Hk0.b((AppCompatActivity)stringArray))) {
                n7 = 1;
                object = Toast.makeText((Context)stringArray, (CharSequence)"Please grant Mic permission from the App Settings.", (int)n7);
                object.show();
            } else {
                object = stringArray.p2();
                object.deny();
            }
        }
    }

    public void accept(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function1 function1 = (Function1)this.b;
                Intrinsics.checkNotNullParameter(function1, "$tmp0");
                function1.invoke(object);
                return;
            }
            case 2: {
                Function1 function1 = (Function1)this.b;
                Intrinsics.checkNotNullParameter(function1, "$tmp0");
                function1.invoke(object);
                return;
            }
            case 0: 
        }
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return NewPDPRepo.k((ya_2)((Function1)this.b), object);
    }
}

