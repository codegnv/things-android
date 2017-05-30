package c4gnv.com.thingsregistry.net.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import c4gnv.com.thingsregistry.util.StringUtil;

public class Thing implements Serializable {

    private static final long serialVersionUID = 1;

    private String id;
    private String serialNumber;
    private String name;
    private String description;
    private String icon;
    private String typeId;
    private List<Integer> pieceId;
    private List<Piece> pieces;

    public Thing() {
        // No-op
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public List<Integer> getPieceId() {
        return pieceId;
    }

    public void setPieceId(List<Integer> pieceId) {
        this.pieceId = pieceId;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public void addPiece(Piece piece) {
        if (this.pieces == null) {
            this.pieces = new ArrayList<>();
        }

        this.pieces.add(piece);
    }

    public void generateSerial() {
        if (StringUtil.isEmpty(serialNumber)) {
            this.serialNumber = UUID.randomUUID().toString();
        }
    }
}
