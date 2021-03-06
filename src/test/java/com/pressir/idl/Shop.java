package com.pressir.idl;

/**
 * Autogenerated by Thrift Compiler (0.11.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-09-05")
public class Shop implements
        org.apache.thrift.TBase<Shop, Shop._Fields>,
        java.io.Serializable,
        Cloneable,
        Comparable<Shop> {
    // isset id assignments
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
            new org.apache.thrift.protocol.TStruct("Shop");
    private static final org.apache.thrift.protocol.TField SHOP_ID_FIELD_DESC =
            new org.apache.thrift.protocol.TField("shopId", org.apache.thrift.protocol.TType.STRING, (short) 3);
    private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC =
            new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short) 5);
    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY =
            new ShopStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY =
            new ShopTupleSchemeFactory();

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
                new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.SHOP_ID, new org.apache.thrift.meta_data.FieldMetaData("shopId",
                        org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status",
                org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ShopStatus.class)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Shop.class, metaDataMap);
    }

    public java.lang.String shopId; // required
    /**
     * @see ShopStatus
     */
    public ShopStatus status; // required

    public Shop() {
    }

    public Shop(
            java.lang.String shopId,
            ShopStatus status) {
        this();
        this.shopId = shopId;
        this.status = status;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public Shop(Shop other) {
        if (other.isSetShopId()) {
            this.shopId = other.shopId;
        }
        if (other.isSetStatus()) {
            this.status = other.status;
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ?
                STANDARD_SCHEME_FACTORY :
                TUPLE_SCHEME_FACTORY)
                .getScheme();
    }

    public Shop deepCopy() {
        return new Shop(this);
    }

    @Override
    public void clear() {
        this.shopId = null;
        this.status = null;
    }

    public java.lang.String getShopId() {
        return this.shopId;
    }

    public Shop setShopId(java.lang.String shopId) {
        this.shopId = shopId;
        return this;
    }

    public void unsetShopId() {
        this.shopId = null;
    }

    /**
     * Returns true if field shopId is set (has been assigned a value) and false otherwise
     */
    public boolean isSetShopId() {
        return this.shopId != null;
    }

    public void setShopIdIsSet(boolean value) {
        if (!value) {
            this.shopId = null;
        }
    }

    /**
     * @see ShopStatus
     */
    public ShopStatus getStatus() {
        return this.status;
    }

    /**
     * @see ShopStatus
     */
    public Shop setStatus(ShopStatus status) {
        this.status = status;
        return this;
    }

    public void unsetStatus() {
        this.status = null;
    }

    /**
     * Returns true if field status is set (has been assigned a value) and false otherwise
     */
    public boolean isSetStatus() {
        return this.status != null;
    }

    public void setStatusIsSet(boolean value) {
        if (!value) {
            this.status = null;
        }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
        switch (field) {
            case SHOP_ID:
                if (value == null) {
                    unsetShopId();
                } else {
                    setShopId((java.lang.String) value);
                }
                break;

            case STATUS:
                if (value == null) {
                    unsetStatus();
                } else {
                    setStatus((ShopStatus) value);
                }
                break;

        }
    }

    public java.lang.Object getFieldValue(_Fields field) {
        switch (field) {
            case SHOP_ID:
                return getShopId();

            case STATUS:
                return getStatus();

        }
        throw new java.lang.IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new java.lang.IllegalArgumentException();
        }

        switch (field) {
            case SHOP_ID:
                return isSetShopId();
            case STATUS:
                return isSetStatus();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof Shop)
            return this.equals((Shop) that);
        return false;
    }

    public boolean equals(Shop that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_shopId = true && this.isSetShopId();
        boolean that_present_shopId = true && that.isSetShopId();
        if (this_present_shopId || that_present_shopId) {
            if (!(this_present_shopId && that_present_shopId))
                return false;
            if (!this.shopId.equals(that.shopId))
                return false;
        }

        boolean this_present_status = true && this.isSetStatus();
        boolean that_present_status = true && that.isSetStatus();
        if (this_present_status || that_present_status) {
            if (!(this_present_status && that_present_status))
                return false;
            if (!this.status.equals(that.status))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((isSetShopId()) ? 131071 : 524287);
        if (isSetShopId())
            hashCode = hashCode * 8191 + shopId.hashCode();

        hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
        if (isSetStatus())
            hashCode = hashCode * 8191 + status.getValue();

        return hashCode;
    }

    @Override
    public int compareTo(Shop other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = java.lang.Boolean.valueOf(isSetShopId()).compareTo(other.isSetShopId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetShopId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shopId, other.shopId);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetStatus()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        scheme(oprot).write(oprot, this);
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Shop(");
        boolean first = true;

        sb.append("shopId:");
        if (this.shopId == null) {
            sb.append("null");
        } else {
            sb.append(this.shopId);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("status:");
        if (this.status == null) {
            sb.append("null");
        } else {
            sb.append(this.status);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        if (shopId == null) {
            throw new org.apache.thrift.protocol.TProtocolException(
                    "Required field 'shopId' was not present! Struct: " + toString());
        }
        if (status == null) {
            throw new org.apache.thrift.protocol.TProtocolException(
                    "Required field 'status' was not present! Struct: " + toString());
        }
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(
                    new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(
                    new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        SHOP_ID((short) 3, "shopId"),
        /**
         * @see ShopStatus
         */
        STATUS((short) 5, "status");

        private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        private final short _thriftId;
        private final java.lang.String _fieldName;

        _Fields(short thriftId, java.lang.String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 3: // SHOP_ID
                    return SHOP_ID;
                case 5: // STATUS
                    return STATUS;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(java.lang.String name) {
            return byName.get(name);
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public java.lang.String getFieldName() {
            return _fieldName;
        }
    }

    private static class ShopStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ShopStandardScheme getScheme() {
            return new ShopStandardScheme();
        }
    }

    private static class ShopStandardScheme extends org.apache.thrift.scheme.StandardScheme<Shop> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, Shop struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 3: // SHOP_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.shopId = iprot.readString();
                            struct.setShopIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 5: // STATUS
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.status = ShopStatus.findByValue(iprot.readI32());
                            struct.setStatusIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, Shop struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.shopId != null) {
                oprot.writeFieldBegin(SHOP_ID_FIELD_DESC);
                oprot.writeString(struct.shopId);
                oprot.writeFieldEnd();
            }
            if (struct.status != null) {
                oprot.writeFieldBegin(STATUS_FIELD_DESC);
                oprot.writeI32(struct.status.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class ShopTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ShopTupleScheme getScheme() {
            return new ShopTupleScheme();
        }
    }

    private static class ShopTupleScheme extends org.apache.thrift.scheme.TupleScheme<Shop> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, Shop struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            oprot.writeString(struct.shopId);
            oprot.writeI32(struct.status.getValue());
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, Shop struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            struct.shopId = iprot.readString();
            struct.setShopIdIsSet(true);
            struct.status = ShopStatus.findByValue(iprot.readI32());
            struct.setStatusIsSet(true);
        }
    }
}

