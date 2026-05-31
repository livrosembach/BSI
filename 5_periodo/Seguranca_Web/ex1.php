<?php

$passphrase = "LIVIA40092766";

$encrypted_message = 'U2FsdGVkX188z0GtDedzKsHJN6WDfIOHeR8LHRLI+vc=';

$extracted_data = base64_decode($encrypted_message, true);

$salt = substr($extracted_data, 8, 8);

$encrypted_text = substr($extracted_data, 16);
$derived_material = openssl_pbkdf2($passphrase, $salt, 48, 200000, 'sha256');

$aes_key = substr($derived_material, 0, 32);

$initialization_vector = substr($derived_material, 32, 16);

$decrypted_message = openssl_decrypt(
    $encrypted_text, 
    'aes-256-cbc',
    $aes_key,
    OPENSSL_RAW_DATA,
    $initialization_vector
);

echo "Secret: " . $decrypted_message . "\n";

?>
