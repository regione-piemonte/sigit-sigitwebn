/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitwebn.util;

import java.io.IOException;
import java.io.Reader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;

public class PemUtils {

	private static byte[] parsePEMFile(Reader readerFile) throws IOException {
		 if (readerFile == null) {
	            System.out.println("Il readerFile e' nullo");
	        }
	        PemReader reader = new PemReader(readerFile);
	        PemObject pemObject = reader.readPemObject();
	        byte[] content = pemObject.getContent();
	        reader.close();
	        return content;
	}

	private static PublicKey getPublicKey(byte[] keyBytes, String algorithm) {
		PublicKey publicKey = null;
		try {
			KeyFactory kf = KeyFactory.getInstance(algorithm);
			EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
			publicKey = kf.generatePublic(keySpec);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Could not reconstruct the public key, the given algorithm could not be found.");
		} catch (InvalidKeySpecException e) {
			System.out.println("Could not reconstruct the public key");
		}

		return publicKey;
	}

	private static PrivateKey getPrivateKey(byte[] keyBytes, String algorithm) {
		PrivateKey privateKey = null;
		try {
			KeyFactory kf = KeyFactory.getInstance(algorithm);
			EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
			privateKey = kf.generatePrivate(keySpec);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Could not reconstruct the private key, the given algorithm could not be found.");
		} catch (InvalidKeySpecException e) {
			System.out.println("Could not reconstruct the private key");
			e.printStackTrace();
		}

		return privateKey;
	}

	public static PublicKey readPublicKeyFromFile(Reader reader, String algorithm) throws IOException {
		byte[] bytes = PemUtils.parsePEMFile(reader);
		return PemUtils.getPublicKey(bytes, algorithm);
	}

	public static PrivateKey readPrivateKeyFromFile(Reader reader, String algorithm) throws IOException {
		byte[] bytes = PemUtils.parsePEMFile(reader);
        return PemUtils.getPrivateKey(bytes, algorithm);
	}
}
