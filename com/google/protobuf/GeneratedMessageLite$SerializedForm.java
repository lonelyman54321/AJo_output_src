/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class GeneratedMessageLite$SerializedForm
implements Serializable {
    private static final long serialVersionUID;
    private final byte[] asBytes;
    private final Class messageClass;
    private final String messageClassName;

    public GeneratedMessageLite$SerializedForm(MessageLite object) {
        Object object2 = object.getClass();
        this.messageClass = object2;
        this.messageClassName = object2 = object.getClass().getName();
        object = object.toByteArray();
        this.asBytes = (byte[])object;
    }

    public static GeneratedMessageLite$SerializedForm of(MessageLite messageLite) {
        GeneratedMessageLite$SerializedForm generatedMessageLite$SerializedForm = new GeneratedMessageLite$SerializedForm(messageLite);
        return generatedMessageLite$SerializedForm;
    }

    private Object readResolveFallback() {
        ClassNotFoundException classNotFoundException2;
        Object object;
        block18: {
            NoSuchFieldException noSuchFieldException2;
            block17: {
                SecurityException securityException2;
                block16: {
                    IllegalAccessException illegalAccessException2;
                    block15: {
                        Object object2 = this.resolveMessageClass();
                        object = "defaultInstance";
                        object2 = ((Class)object2).getDeclaredField((String)object);
                        boolean bl2 = true;
                        ((AccessibleObject)object2).setAccessible(bl2);
                        bl2 = false;
                        object = null;
                        object2 = ((Field)object2).get(null);
                        object2 = (MessageLite)object2;
                        object2 = object2.newBuilderForType();
                        object = this.asBytes;
                        object2 = object2.mergeFrom((byte[])object);
                        try {
                            return object2.buildPartial();
                        }
                        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block15;
                        }
                        catch (SecurityException securityException2) {
                            break block16;
                        }
                        catch (NoSuchFieldException noSuchFieldException2) {
                            break block17;
                        }
                        catch (ClassNotFoundException classNotFoundException2) {
                            break block18;
                        }
                        object = new RuntimeException("Unable to understand proto buffer", invalidProtocolBufferException);
                        throw object;
                    }
                    object = new RuntimeException("Unable to call parsePartialFrom", illegalAccessException2);
                    throw object;
                }
                CharSequence charSequence = new StringBuilder("Unable to call defaultInstance in ");
                String string2 = this.messageClassName;
                charSequence.append(string2);
                charSequence = charSequence.toString();
                object = new RuntimeException((String)charSequence, securityException2);
                throw object;
            }
            CharSequence charSequence = new StringBuilder("Unable to find defaultInstance in ");
            String string3 = this.messageClassName;
            charSequence.append(string3);
            charSequence = charSequence.toString();
            object = new RuntimeException((String)charSequence, noSuchFieldException2);
            throw object;
        }
        CharSequence charSequence = new StringBuilder("Unable to find proto buffer class: ");
        String string4 = this.messageClassName;
        charSequence.append(string4);
        charSequence = charSequence.toString();
        object = new RuntimeException((String)charSequence, classNotFoundException2);
        throw object;
    }

    private Class resolveMessageClass() {
        Class<?> clazz = this.messageClass;
        if (clazz == null) {
            clazz = Class.forName(this.messageClassName);
        }
        return clazz;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object readResolve() {
        ClassNotFoundException classNotFoundException2222;
        block8: {
            SecurityException securityException2222;
            block7: {
                IllegalAccessException illegalAccessException2222;
                block6: {
                    try {
                        Object object2 = this.resolveMessageClass();
                        Object object = "DEFAULT_INSTANCE";
                        object2 = ((Class)object2).getDeclaredField((String)object);
                        boolean bl2 = true;
                        ((AccessibleObject)object2).setAccessible(bl2);
                        bl2 = false;
                        object = null;
                        object2 = ((Field)object2).get(null);
                        object2 = (MessageLite)object2;
                        object2 = object2.newBuilderForType();
                        object = this.asBytes;
                        object2 = object2.mergeFrom((byte[])object);
                        return object2.buildPartial();
                    }
                    catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                    }
                    catch (IllegalAccessException illegalAccessException2222) {
                        break block6;
                    }
                    catch (SecurityException securityException2222) {
                        break block7;
                    }
                    catch (ClassNotFoundException classNotFoundException2222) {
                        break block8;
                    }
                    catch (NoSuchFieldException noSuchFieldException) {
                        return this.readResolveFallback();
                    }
                    RuntimeException runtimeException = new RuntimeException("Unable to understand proto buffer", invalidProtocolBufferException);
                    throw runtimeException;
                }
                RuntimeException runtimeException = new RuntimeException("Unable to call parsePartialFrom", illegalAccessException2222);
                throw runtimeException;
            }
            CharSequence charSequence = new StringBuilder("Unable to call DEFAULT_INSTANCE in ");
            String string2 = this.messageClassName;
            charSequence.append(string2);
            charSequence = charSequence.toString();
            RuntimeException runtimeException = new RuntimeException((String)charSequence, securityException2222);
            throw runtimeException;
        }
        CharSequence charSequence = new StringBuilder("Unable to find proto buffer class: ");
        String string3 = this.messageClassName;
        charSequence.append(string3);
        charSequence = charSequence.toString();
        RuntimeException runtimeException = new RuntimeException((String)charSequence, classNotFoundException2222);
        throw runtimeException;
    }
}

