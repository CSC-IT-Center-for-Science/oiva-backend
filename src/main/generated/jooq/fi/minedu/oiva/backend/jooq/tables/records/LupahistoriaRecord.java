/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.jooq.tables.records;


import fi.minedu.oiva.backend.jooq.tables.Lupahistoria;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LupahistoriaRecord extends UpdatableRecordImpl<LupahistoriaRecord> implements Record9<Long, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1830079868;

    /**
     * Setter for <code>oiva.lupahistoria.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>oiva.lupahistoria.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>oiva.lupahistoria.diaarinumero</code>.
     */
    public void setDiaarinumero(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>oiva.lupahistoria.diaarinumero</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getDiaarinumero() {
        return (String) get(1);
    }

    /**
     * Setter for <code>oiva.lupahistoria.ytunnus</code>.
     */
    public void setYtunnus(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>oiva.lupahistoria.ytunnus</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getYtunnus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>oiva.lupahistoria.oid</code>.
     */
    public void setOid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>oiva.lupahistoria.oid</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getOid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>oiva.lupahistoria.maakunta</code>.
     */
    public void setMaakunta(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>oiva.lupahistoria.maakunta</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getMaakunta() {
        return (String) get(4);
    }

    /**
     * Setter for <code>oiva.lupahistoria.tila</code>.
     */
    public void setTila(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>oiva.lupahistoria.tila</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getTila() {
        return (String) get(5);
    }

    /**
     * Setter for <code>oiva.lupahistoria.voimassaolo</code>.
     */
    public void setVoimassaolo(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>oiva.lupahistoria.voimassaolo</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getVoimassaolo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>oiva.lupahistoria.paatospvm</code>.
     */
    public void setPaatospvm(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>oiva.lupahistoria.paatospvm</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getPaatospvm() {
        return (String) get(7);
    }

    /**
     * Setter for <code>oiva.lupahistoria.filename</code>.
     */
    public void setFilename(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>oiva.lupahistoria.filename</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getFilename() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Lupahistoria.LUPAHISTORIA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Lupahistoria.LUPAHISTORIA.DIAARINUMERO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Lupahistoria.LUPAHISTORIA.YTUNNUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Lupahistoria.LUPAHISTORIA.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Lupahistoria.LUPAHISTORIA.MAAKUNTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Lupahistoria.LUPAHISTORIA.TILA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Lupahistoria.LUPAHISTORIA.VOIMASSAOLO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Lupahistoria.LUPAHISTORIA.PAATOSPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Lupahistoria.LUPAHISTORIA.FILENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDiaarinumero();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getYtunnus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMaakunta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTila();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getVoimassaolo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPaatospvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupahistoriaRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupahistoriaRecord value2(String value) {
        setDiaarinumero(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupahistoriaRecord value3(String value) {
        setYtunnus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupahistoriaRecord value4(String value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupahistoriaRecord value5(String value) {
        setMaakunta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupahistoriaRecord value6(String value) {
        setTila(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupahistoriaRecord value7(String value) {
        setVoimassaolo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupahistoriaRecord value8(String value) {
        setPaatospvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupahistoriaRecord value9(String value) {
        setFilename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupahistoriaRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LupahistoriaRecord
     */
    public LupahistoriaRecord() {
        super(Lupahistoria.LUPAHISTORIA);
    }

    /**
     * Create a detached, initialised LupahistoriaRecord
     */
    public LupahistoriaRecord(Long id, String diaarinumero, String ytunnus, String oid, String maakunta, String tila, String voimassaolo, String paatospvm, String filename) {
        super(Lupahistoria.LUPAHISTORIA);

        set(0, id);
        set(1, diaarinumero);
        set(2, ytunnus);
        set(3, oid);
        set(4, maakunta);
        set(5, tila);
        set(6, voimassaolo);
        set(7, paatospvm);
        set(8, filename);
    }
}