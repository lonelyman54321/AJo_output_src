/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.build.BuildConfigPropertiesProvider;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class OsNameProvider
extends StringPropertyProvider {
    private final BuildConfigPropertiesProvider buildConfigPropertiesProvider;
    private final ProviderType key;
    private final float order;

    public OsNameProvider(BuildConfigPropertiesProvider object) {
        Intrinsics.checkNotNullParameter(object, "buildConfigPropertiesProvider");
        this.buildConfigPropertiesProvider = object;
        this.order = 43.0f;
        object = ProviderType.OS_NAME;
        this.key = object;
    }

    private final String toCodeName(int n3) {
        String string2 = "Gingerbread";
        String string3 = "Ice Cream Sandwich";
        String string4 = "Nougat";
        String string5 = "Oreo";
        String string6 = "Eclair";
        String string7 = "Honeycomb";
        String string8 = "Jelly Bean";
        String string9 = "Lollipop";
        switch (n3) {
            default: {
                string2 = null;
                break;
            }
            case 31: {
                string2 = "Android12";
                break;
            }
            case 30: {
                string2 = "Android11";
                break;
            }
            case 29: {
                string2 = "Android10";
                break;
            }
            case 28: {
                string2 = "Pie";
                break;
            }
            case 26: 
            case 27: {
                string2 = string5;
                break;
            }
            case 24: 
            case 25: {
                string2 = string4;
                break;
            }
            case 23: {
                string2 = "Marshmallow";
                break;
            }
            case 20: 
            case 21: 
            case 22: {
                string2 = string9;
                break;
            }
            case 19: {
                string2 = "KitKat";
                break;
            }
            case 16: 
            case 17: 
            case 18: {
                string2 = string8;
                break;
            }
            case 14: 
            case 15: {
                string2 = string3;
                break;
            }
            case 11: 
            case 12: 
            case 13: {
                string2 = string7;
                break;
            }
            case 8: {
                string2 = "Froyo";
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                string2 = string6;
                break;
            }
            case 4: {
                string2 = "Donut";
                break;
            }
            case 3: {
                string2 = "Cupcake";
                break;
            }
            case 2: {
                string2 = "1.1";
                break;
            }
            case 1: {
                string2 = "1.0";
            }
            case 9: 
            case 10: 
        }
        return string2;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        int n3 = this.buildConfigPropertiesProvider.getSDKVersion();
        return this.toCodeName(n3);
    }
}

