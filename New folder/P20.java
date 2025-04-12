/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.tooling.ComposeViewAdapter;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

public final class P20
extends MutablePropertyReference0Impl {
    public final Object get() {
        return ((ComposeViewAdapter)((Object)this.receiver)).getClock$ui_tooling_release();
    }

    public final void set(Object object) {
        ComposeViewAdapter composeViewAdapter = (ComposeViewAdapter)((Object)this.receiver);
        object = (Sy2)object;
        composeViewAdapter.setClock$ui_tooling_release((Sy2)object);
    }
}

