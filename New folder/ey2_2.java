/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/*
 * Renamed from ey2
 */
public final class ey2_2
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ey2_2(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(0);
    }

    public final Object invoke() {
        int n3 = this.c;
        switch (n3) {
            default: {
                NativeAdViewRenderer.access$prepredNativeVideoAd((NativeAdViewRenderer)this.d);
                return Unit.a;
            }
            case 0: 
        }
        Object object = (File)((Function0)this.d).invoke();
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = ((File)object).getName();
        Intrinsics.checkNotNullExpressionValue(object2, "getName(...)");
        char c2 = '.';
        String string2 = "";
        object2 = StringsKt.g0(c2, (String)object2, string2);
        String string3 = "preferences_pb";
        boolean bl2 = Intrinsics.areEqual(object2, string3);
        if (bl2) {
            return object;
        }
        object2 = new StringBuilder("File extension for file: ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" does not match required extension for Preferences file: preferences_pb");
        object = ((StringBuilder)object2).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

