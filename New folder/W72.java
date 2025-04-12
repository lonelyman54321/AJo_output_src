/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public abstract class W72 {
    private final CopyOnWriteArrayList cancellables;
    private Function0 enabledChangedCallback;
    private boolean isEnabled;

    public W72(boolean bl2) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.isEnabled = bl2;
        this.cancellables = copyOnWriteArrayList = new CopyOnWriteArrayList();
    }

    public final void addCancellable(al_0 al_02) {
        Intrinsics.checkNotNullParameter(al_02, "cancellable");
        this.cancellables.add(al_02);
    }

    public final Function0 getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(uu_0 uu_02) {
        Intrinsics.checkNotNullParameter(uu_02, "backEvent");
    }

    public void handleOnBackStarted(uu_0 uu_02) {
        Intrinsics.checkNotNullParameter(uu_02, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        boolean bl2;
        Iterator iterator = this.cancellables.iterator();
        while (bl2 = iterator.hasNext()) {
            al_0 al_02 = (al_0)iterator.next();
            al_02.cancel();
        }
    }

    public final void removeCancellable(al_0 al_02) {
        Intrinsics.checkNotNullParameter(al_02, "cancellable");
        this.cancellables.remove(al_02);
    }

    public final void setEnabled(boolean bl2) {
        this.isEnabled = bl2;
        Function0 function0 = this.enabledChangedCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(Function0 function0) {
        this.enabledChangedCallback = function0;
    }
}

