package net.alenzen.a2l;

import java.io.IOException;
import java.util.List;

public class Module implements IA2LWriteable {
	private String name;
	private String longIdentifier;

	// optional parameters
	private List<A2ml> a2ml;
	private List<AxisPts> axisPts;
	private List<Characteristic> characteristics;
	private List<CompuMethod> compuMethods;
	private List<CompuTab> compuTabs;
	private List<CompuVTab> compuVTabs;
	private List<CompuVTabRange> compuVTabRanges;
	private Frame frame;
	private List<Function> functions;
	private List<Group> groups;
	private List<IfData> ifDatas;
	private List<Measurement> measurements;
	private ModCommon modCommon;
	private ModPar modPar;
	private List<RecordLayout> recordLayouts;
	private List<Unit> units;
	private List<UserRights> userRights;
	private VariantCoding variantCoding;
	private List<Blob> blobs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLongIdentifier() {
		return longIdentifier;
	}

	public void setLongIdentifier(String longIdentifier) {
		this.longIdentifier = longIdentifier;
	}

	public List<A2ml> getA2ml() {
		return a2ml;
	}

	public void setA2ml(List<A2ml> a2ml) {
		this.a2ml = a2ml;
	}

	public List<AxisPts> getAxisPts() {
		return axisPts;
	}

	public void setAxisPts(List<AxisPts> axisPts) {
		this.axisPts = axisPts;
	}

	public List<Characteristic> getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(List<Characteristic> characteristics) {
		this.characteristics = characteristics;
	}

	public List<CompuMethod> getCompuMethods() {
		return compuMethods;
	}

	public void setCompuMethods(List<CompuMethod> compuMethods) {
		this.compuMethods = compuMethods;
	}

	public List<CompuTab> getCompuTabs() {
		return compuTabs;
	}

	public void setCompuTabs(List<CompuTab> compuTabs) {
		this.compuTabs = compuTabs;
	}

	public List<CompuVTab> getCompuVTabs() {
		return compuVTabs;
	}

	public void setCompuVTabs(List<CompuVTab> compuVTabs) {
		this.compuVTabs = compuVTabs;
	}

	public List<CompuVTabRange> getCompuVTabRanges() {
		return compuVTabRanges;
	}

	public void setCompuVTabRanges(List<CompuVTabRange> compuVTabRanges) {
		this.compuVTabRanges = compuVTabRanges;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public List<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public List<IfData> getIfDatas() {
		return ifDatas;
	}

	public void setIfDatas(List<IfData> ifDatas) {
		this.ifDatas = ifDatas;
	}

	public List<Measurement> getMeasurements() {
		return measurements;
	}

	public void setMeasurements(List<Measurement> measurements) {
		this.measurements = measurements;
	}

	public ModCommon getModCommon() {
		return modCommon;
	}

	public void setModCommon(ModCommon modCommon) {
		this.modCommon = modCommon;
	}

	public ModPar getModPar() {
		return modPar;
	}

	public void setModPar(ModPar modPar) {
		this.modPar = modPar;
	}

	public List<RecordLayout> getRecordLayouts() {
		return recordLayouts;
	}

	public void setRecordLayouts(List<RecordLayout> recordLayouts) {
		this.recordLayouts = recordLayouts;
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

	public List<UserRights> getUserRights() {
		return userRights;
	}

	public void setUserRights(List<UserRights> userRights) {
		this.userRights = userRights;
	}

	public VariantCoding getVariantCoding() {
		return variantCoding;
	}

	public void setVariantCoding(VariantCoding variantCoding) {
		this.variantCoding = variantCoding;
	}

	public List<Blob> getBlobs() {
		return blobs;
	}

	public void setBlobs(List<Blob> blobs) {
		this.blobs = blobs;
	}

	public void writeTo(A2LWriter writer) throws IOException {
		writer.writelnBeginSpaced("MODULE", name, A2LWriter.toA2LString(longIdentifier));
		writer.indent();
		
		writer.write(a2ml);
		writer.write(axisPts);
		writer.write(characteristics);
		writer.write(compuMethods);
		writer.write(compuTabs);
		writer.write(compuVTabs);
		writer.write(compuVTabRanges);
		writer.write(frame);
		writer.write(functions);
		writer.write(groups);
		writer.write(ifDatas);
		writer.write(measurements);
		writer.write(modCommon);
		writer.write(modPar);
		writer.write(recordLayouts);
		writer.write(units);
		writer.write(userRights);
		writer.write(variantCoding);
		writer.write(blobs);
		
		writer.dedent();
		writer.writelnEnd("MODULE");
	}
}
