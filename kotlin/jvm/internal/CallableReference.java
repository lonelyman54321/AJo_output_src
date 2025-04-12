/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.CallableReference$NoReceiver;
import kotlin.jvm.internal.Reflection;

public abstract class CallableReference
implements xn1_2,
Serializable {
    public static final Object NO_RECEIVER = CallableReference$NoReceiver.access$000();
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient xn1_2 reflected;
    private final String signature;

    public CallableReference() {
        Object object = NO_RECEIVER;
        this(object);
    }

    public CallableReference(Object object) {
        this(object, null, null, null, false);
    }

    public CallableReference(Object object, Class clazz, String string2, String string3, boolean bl2) {
        this.receiver = object;
        this.owner = clazz;
        this.name = string2;
        this.signature = string3;
        this.isTopLevel = bl2;
    }

    public Object call(Object ... objectArray) {
        return this.getReflected().call(objectArray);
    }

    public Object callBy(Map map2) {
        return this.getReflected().callBy(map2);
    }

    public xn1_2 compute() {
        xn1_2 xn1_22 = this.reflected;
        if (xn1_22 == null) {
            this.reflected = xn1_22 = this.computeReflected();
        }
        return xn1_22;
    }

    public abstract xn1_2 computeReflected();

    public List getAnnotations() {
        return this.getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public an1_2 getOwner() {
        boolean bl2;
        Object object = this.owner;
        object = object == null ? null : ((bl2 = this.isTopLevel) ? Reflection.getOrCreateKotlinPackage((Class)object) : Reflection.getOrCreateKotlinClass((Class)object));
        return object;
    }

    public List getParameters() {
        return this.getReflected().getParameters();
    }

    public xn1_2 getReflected() {
        Object object = this.compute();
        if (object != this) {
            return object;
        }
        object = new lo1_2();
        throw object;
    }

    public kn1_1 getReturnType() {
        return this.getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List getTypeParameters() {
        return this.getReflected().getTypeParameters();
    }

    public on1_1 getVisibility() {
        return this.getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return this.getReflected().isAbstract();
    }

    public boolean isFinal() {
        return this.getReflected().isFinal();
    }

    public boolean isOpen() {
        return this.getReflected().isOpen();
    }

    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }
}

