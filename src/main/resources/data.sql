INSERT INTO kyc_db2 (kyc_id, investor_profile, time_horizon, investor_objectives, risk_profile, networth, gross_annual_income) VALUES
  (100, 2, 3,2,4,2,1),
  (101, 2, 2,3,4,2,2),
  (102, 2, 3,3,4,2,1),
  (103, 2, 2,2,4,2,2);


  INSERT INTO web_qa (web_qa_id, qa_group, qa_key, descr_en, tag, web_sis_tag_id) VALUES
    (1, 'THO', 'TimeHorizon','I want to Invest For the','Q','2'),
    (2, 'THO', '1','Long Term','A','1'),
    (3, 'THO', '2','Medium Term','A','1'),
    (4, 'THO', '3','Short Term','A','1'),
    (5, 'GAI', 'HouseholdIncome','My Annual HouseHold Income is','Q','2'),
    (6, 'GAI', '1','over 100K','A','2'),
    (7, 'GAI', '2','75k to 100k','A','2');


