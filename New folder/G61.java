/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.appindexing.Action;
import com.google.firebase.appindexing.FirebaseUserActions;
import com.google.firebase.appindexing.builders.Actions;
import kotlin.jvm.internal.Intrinsics;

public final class G61
implements lu1 {
    public final Context a;

    public G61(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public final void endSession() {
        FirebaseUserActions firebaseUserActions = FirebaseUserActions.getInstance(this.a);
        Action action = Actions.newView("Home Page", "Home");
        Intrinsics.checkNotNullExpressionValue(action, "newView(...)");
        firebaseUserActions.end(action);
    }

    public final void startSession() {
        FirebaseUserActions firebaseUserActions = FirebaseUserActions.getInstance(this.a);
        Action action = Actions.newView("Home Page", "Home");
        Intrinsics.checkNotNullExpressionValue(action, "newView(...)");
        firebaseUserActions.start(action);
    }
}

