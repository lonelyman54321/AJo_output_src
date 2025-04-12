/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.Component;
import com.ril.ajio.kmm.shared.model.home.Component$$serializer;
import com.ril.ajio.kmm.shared.model.home.Slot$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class Slot {
    public static final Slot$Companion Companion;
    private Component component;

    static {
        Slot$Companion slot$Companion;
        Companion = slot$Companion = new Slot$Companion(null);
    }

    public Slot() {
        this(null, 1, null);
    }

    public /* synthetic */ Slot(int n3, Component component, a03_0 a03_02) {
        if ((n3 &= 1) == 0) {
            n3 = 0;
            this.component = null;
        } else {
            this.component = component;
        }
    }

    public Slot(Component component) {
        this.component = component;
    }

    public /* synthetic */ Slot(Component component, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            component = null;
        }
        this(component);
    }

    public static /* synthetic */ Slot copy$default(Slot slot, Component component, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            component = slot.component;
        }
        return slot.copy(component);
    }

    public static final /* synthetic */ void write$Self$shared_release(Slot object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((Slot)object).component) != null) {
            object2 = Component$$serializer.INSTANCE;
            object = ((Slot)object).component;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, object);
        }
    }

    public final Component component1() {
        return this.component;
    }

    public final Slot copy(Component component) {
        Slot slot = new Slot(component);
        return slot;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Slot;
        if (!bl3) {
            return false;
        }
        object = (Slot)object;
        Component component = this.component;
        object = ((Slot)object).component;
        boolean bl4 = Intrinsics.areEqual(component, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Component getComponent() {
        return this.component;
    }

    public int hashCode() {
        int n3;
        Component component = this.component;
        if (component == null) {
            n3 = 0;
            component = null;
        } else {
            n3 = component.hashCode();
        }
        return n3;
    }

    public final void setComponent(Component component) {
        this.component = component;
    }

    public String toString() {
        Component component = this.component;
        StringBuilder stringBuilder = new StringBuilder("Slot(component=");
        stringBuilder.append(component);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

