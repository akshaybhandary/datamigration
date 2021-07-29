DROP TABLE IF EXISTS kyc_db2;

CREATE TABLE kyc_db2 (
    kyc_id INT AUTO_INCREMENT  PRIMARY KEY,
    investor_profile INT NOT NULL,
    time_horizon INT NOT NULL,
    investor_objectives INT NOT NULL,
    risk_profile INT NOT NULL,
    networth INT NOT NULL,
    gross_annual_income INT NOT NULL
);


CREATE TABLE web_qa (
    web_qa_id INT AUTO_INCREMENT  PRIMARY KEY,
    qa_group varchar NOT NULL,
    qa_key varchar NOT NULL,
    descr_en varchar NOT NULL,
    tag varchar NOT NULL,
    web_sis_tag_id varchar NOT NULL
);
