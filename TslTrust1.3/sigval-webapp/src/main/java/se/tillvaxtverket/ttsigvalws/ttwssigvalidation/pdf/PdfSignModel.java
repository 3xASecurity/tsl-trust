/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.tillvaxtverket.ttsigvalws.ttwssigvalidation.pdf;

import java.security.cert.Certificate;
import org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions;
import org.bouncycastle.cms.CMSSignedData;

/**
 *
 * @author stefan
 */
public class PdfSignModel {

    private String originalLoc;
    private String signedLoc;
    private long signingAndIdTime;
    private CMSSignedData signedData;
    private byte[] signatureBytes;
    private byte[] cmsSigAttrBytes;
    private Certificate[] chain;
    private Certificate signCert;
    private SupportedSigAlgoritm sigAlgo;
    private String signerName, signerLocation, reasonForSigning;
    boolean replacedSig = false;
    private SignatureOptions options;
    private boolean padesBesSignature;
    private boolean padesIssuerSerial;

    public PdfSignModel(String originalLoc, String signedLoc, long signingAndIdTime, String signerName, String signerLocation, String reasonForSigning, SignatureOptions options) {
        this.originalLoc = originalLoc;
        this.signedLoc = signedLoc;
        this.signingAndIdTime = signingAndIdTime;
        this.signerName = signerName;
        this.signerLocation = signerLocation;
        this.reasonForSigning = reasonForSigning;
        this.options = options;
    }

    public String getOriginalLoc() {
        return originalLoc;
    }

    public void setOriginalLoc(String originalLoc) {
        this.originalLoc = originalLoc;
    }

    public String getSignedLoc() {
        return signedLoc;
    }

    public void setSignedLoc(String signedLoc) {
        this.signedLoc = signedLoc;
    }

    public long getSigningAndIdTime() {
        return signingAndIdTime;
    }

    public void setSigningAndIdTime(long signingAndIdTime) {
        this.signingAndIdTime = signingAndIdTime;
    }

    public CMSSignedData getSignedData() {
        return signedData;
    }

    public void setSignedData(CMSSignedData signedData) {
        this.signedData = signedData;
    }

    public byte[] getSignatureBytes() {
        return signatureBytes;
    }

    public void setSignatureBytes(byte[] signatureBytes) {
        this.signatureBytes = signatureBytes;
    }

    public byte[] getCmsSigAttrBytes() {
        return cmsSigAttrBytes;
    }

    public void setCmsSigAttrBytes(byte[] cmsSigAttrBytes) {
        this.cmsSigAttrBytes = cmsSigAttrBytes;
    }

    public Certificate[] getChain() {
        return chain;
    }

    public void setChain(Certificate[] chain) {
        this.chain = chain;
    }

    public Certificate getSignCert() {
        return signCert;
    }

    public void setSignCert(Certificate signCert) {
        this.signCert = signCert;
    }

    public SupportedSigAlgoritm getSigAlgo() {
        return sigAlgo;
    }

    public void setSigAlgo(SupportedSigAlgoritm sigAlgo) {
        this.sigAlgo = sigAlgo;
    }

    public String getSignerName() {
        return signerName;
    }

    public void setSignerName(String signerName) {
        this.signerName = signerName;
    }

    public String getSignerLocation() {
        return signerLocation;
    }

    public void setSignerLocation(String signerLocation) {
        this.signerLocation = signerLocation;
    }

    public String getReasonForSigning() {
        return reasonForSigning;
    }

    public void setReasonForSigning(String reasonForSigning) {
        this.reasonForSigning = reasonForSigning;
    }

    public boolean isReplacedSig() {
        return replacedSig;
    }

    public void setReplacedSig(boolean replacedSig) {
        this.replacedSig = replacedSig;
    }

    public SignatureOptions getOptions() {
        return options;
    }

    public void setOptions(SignatureOptions options) {
        this.options = options;
    }

    public boolean isPadesBesSignature() {
        return padesBesSignature;
    }

    public void setPadesBesSignature(boolean padesBesSignature) {
        this.padesBesSignature = padesBesSignature;
    }

    public boolean isPadesIssuerSerial() {
        return padesIssuerSerial;
    }

    public void setPadesIssuerSerial(boolean padesIssuerSerial) {
        this.padesIssuerSerial = padesIssuerSerial;
    }

}
