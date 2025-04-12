/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.Transformer;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class H02
implements o60_0,
Transformer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ H02(Object object, int n3) {
        this.a = n3;
        this.b = object;
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
            case 1: {
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
        EventGDTLogger eventGDTLogger = (EventGDTLogger)this.b;
        object = (SessionEvent)object;
        return EventGDTLogger.a(eventGDTLogger, (SessionEvent)object);
    }
}

