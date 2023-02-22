INSERT INTO university_groups (university_group_id, group_name)
VALUES('fc3a325f-81b1-4b1c-923d-e98f6ddda08d','EE-1');
INSERT INTO university_groups (university_group_id, group_name)
VALUES('3ee4cb74-bef5-4f5f-9981-7b618f152552','EE-2');
INSERT INTO university_groups (university_group_id, group_name)
VALUES('6558f340-90c9-4849-b504-3b63e6aa546d','AC-1');
INSERT INTO university_groups (university_group_id, group_name)
VALUES('7145a631-3993-419c-9803-e64b44e0bcd2','MF-1');
INSERT INTO university_groups (university_group_id, group_name)
VALUES('f91f9cdb-0c21-47c0-b8c5-92548897d2de','MF-2');

INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('48445d3e-409c-4611-89aa-e96257734f7e','Alla','Raketa',18,'2022-06-22 11:10:11',
(SELECT university_group_id FROM university_groups WHERE group_name='EE-1'));
INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('f82de0e4-3a6c-4111-94ea-ce2c9aaca4c8','Illay','Petarda',20,'2022-06-22 11:11:22',
(SELECT university_group_id FROM university_groups WHERE group_name='EE-1'));
INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('a0539b3d-865c-4b97-97ce-9bf53b97f49c','Roman','Elephant',45,'2022-06-22 11:12:33',
(SELECT university_group_id FROM university_groups WHERE group_name='EE-1'));

INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('d327049f-9802-4d3d-a482-8f45221f4c0d','Alina','Dream',18,'2022-06-23 12:10:25',
(SELECT university_group_id FROM university_groups WHERE group_name='EE-2'));
INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('d57cae4e-bde3-4868-ae6c-c3d7298a3b04','Evgenii','Obramkin',25,'2022-06-23 12:11:25',
(SELECT university_group_id FROM university_groups WHERE group_name='EE-2'));
INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('db40fd6f-b070-4444-97ba-f7f8765ca893','Evgeniya','Bahamkina',18,'2022-06-23 12:12:25',
(SELECT university_group_id FROM university_groups WHERE group_name='EE-2'));

INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('b3e2b669-6a4b-485f-8a23-5b3fefc45245','Tom','Ivanovich',18,'2022-06-24 10:10:00',
(SELECT university_group_id FROM university_groups WHERE group_name='AC-1'));
INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('df52a0ea-890f-49b6-94c3-6d9d3915afac','Yan','Abramovich',50,'2022-06-24 10:11:15',
(SELECT university_group_id FROM university_groups WHERE group_name='AC-1'));
INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('724d15f7-58f0-4659-af03-f5972a6d86d9','Korol','Imperii',27,'2022-06-24 10:12:37',
(SELECT university_group_id FROM university_groups WHERE group_name='AC-1'));

INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('e0d86f81-d6cf-4cb1-8902-d89ee8c381cf','Lyalya','Korolevich',43,'2022-06-25 13:10:05',
(SELECT university_group_id FROM university_groups WHERE group_name='MF-1'));
INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('6f0ef836-cf02-4bda-920d-f4eda56ecb03','Bohdana','Song',20,'2022-06-25 13:11:15',
(SELECT university_group_id FROM university_groups WHERE group_name='MF-1'));
INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('053ad9b3-10a5-4e92-ac32-4785ec180bc2','Lola','Doll',36,'2022-06-25 13:12:45',
(SELECT university_group_id FROM university_groups WHERE group_name='MF-1'));

INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('c9e7d892-7d39-40ba-b382-349b95d5e671','Nif','Nif',18,'2022-06-26 11:10:25',
(SELECT university_group_id FROM university_groups WHERE group_name='MF-2'));
INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('f2bdf3eb-2ff5-48f0-835d-1eada5963ca1','Naf','Naf',28,'2022-06-26 11:41:45',
(SELECT university_group_id FROM university_groups WHERE group_name='MF-2'));
INSERT INTO students (student_id,first_name,last_name,age,entry_date,university_group_id)
VALUES('7596cf6f-1e2b-4cbe-a859-87aca6f3b667','Naf','Naf',38,'2022-06-26 11:35:20',
(SELECT university_group_id FROM university_groups WHERE group_name='MF-2'));

INSERT INTO teachers (teacher_id,first_name,last_name,age)
VALUES('49e53fa7-cfc0-46b8-bd92-8bd69e876860','Vladislav','Karynuch',30);
INSERT INTO teachers (teacher_id,first_name,last_name,age)
VALUES('6b7b3873-4c4b-4b14-9bcb-9f1883b6b533','Arina','Dyhota',40);
INSERT INTO teachers (teacher_id,first_name,last_name,age)
VALUES('1dc4a6ee-ab31-49dc-b8e7-cac2695421ac','Sofia','Mavka',50);
INSERT INTO teachers (teacher_id,first_name,last_name,age)
VALUES('5ffebbe5-5009-4db7-b3b1-1fa89e3490f2','Alexandr','Smola',42);
INSERT INTO teachers (teacher_id,first_name,last_name,age)
VALUES('c69afeb5-b206-4f9e-b8bb-1f9f5c0f94cd','Orest','Degtyar',37);
INSERT INTO teachers (teacher_id,first_name,last_name,age)
VALUES('2c457734-5023-4f12-a6df-d9f5b69c4522','Olena','Prekrasna',28);

INSERT INTO subjects (subject_id,subject_name,teacher_id)
VALUES('288db4ac-e3ca-44b9-b38f-f7519f99187c','statistics',
(SELECT teacher_id FROM teachers WHERE first_name='Vladislav' AND last_name='Karynuch'));
INSERT INTO subjects (subject_id,subject_name,teacher_id)
VALUES('8c4f4621-ff1d-4123-8952-69826cbb186b','accounting_and_auditing',
(SELECT teacher_id FROM teachers WHERE first_name='Arina' AND last_name='Dyhota'));
INSERT INTO subjects (subject_id,subject_name,teacher_id)
VALUES('4b88b71c-8394-470e-a793-a4e7ab1a54b3','marketing',
(SELECT teacher_id FROM teachers WHERE first_name='Sofia' AND last_name='Mavka'));
INSERT INTO subjects (subject_id,subject_name,teacher_id)
VALUES('18cfc877-1b99-4464-bbeb-db8981d8cbd6','psychology',
(SELECT teacher_id FROM teachers WHERE first_name='Alexandr' AND last_name='Smola'));
INSERT INTO subjects (subject_id,subject_name,teacher_id)
VALUES('4e4eb914-3483-482b-9985-ddf0f550f41a','macroeconomics',
(SELECT teacher_id FROM teachers WHERE first_name='Orest' AND last_name='Degtyar'));
INSERT INTO subjects (subject_id,subject_name,teacher_id)
VALUES('756a96a8-2c9e-444c-95c6-80644aa7e62f','theory_of_economics',
(SELECT teacher_id FROM teachers WHERE first_name='Olena' AND last_name='Prekrasna'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('7924a679-6e27-4886-8dd7-48150fe7dab3',12,'48445d3e-409c-4611-89aa-e96257734f7e',
(SELECT subject_id FROM subjects WHERE subject_name='theory_of_economics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('091a1144-bc8c-4835-9e32-32f5340f849b',12,'f82de0e4-3a6c-4111-94ea-ce2c9aaca4c8',
(SELECT subject_id FROM subjects WHERE subject_name='theory_of_economics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('fceae816-1487-4d7f-8938-6caf356eece8',12,'a0539b3d-865c-4b97-97ce-9bf53b97f49c',
(SELECT subject_id FROM subjects WHERE subject_name='theory_of_economics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('1afb0187-e7e6-4113-bc4c-c153af3b7762',12,'c9e7d892-7d39-40ba-b382-349b95d5e671',
(SELECT subject_id FROM subjects WHERE subject_name='theory_of_economics'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('5b880fc4-6784-448e-a8e2-1a24ec5c9805',11,'db40fd6f-b070-4444-97ba-f7f8765ca893',
(SELECT subject_id FROM subjects WHERE subject_name='theory_of_economics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('11408ad0-d577-466f-a5b4-945fd3512fb8',11,'f2bdf3eb-2ff5-48f0-835d-1eada5963ca1',
(SELECT subject_id FROM subjects WHERE subject_name='theory_of_economics'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('7c3d7cde-0524-49e1-9497-62522ddeae33',10,'d327049f-9802-4d3d-a482-8f45221f4c0d',
(SELECT subject_id FROM subjects WHERE subject_name='theory_of_economics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('f5dacac9-725c-43eb-806a-6e4ffac87028',10,'d57cae4e-bde3-4868-ae6c-c3d7298a3b04',
(SELECT subject_id FROM subjects WHERE subject_name='theory_of_economics'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('53545218-fef0-4bef-944e-85c8be33cb84',9,'7596cf6f-1e2b-4cbe-a859-87aca6f3b667',
(SELECT subject_id FROM subjects WHERE subject_name='theory_of_economics'));


INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('5e9a62a3-a813-4deb-bdad-ec2b3c2441c7',12,'48445d3e-409c-4611-89aa-e96257734f7e',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('151bd3ed-a693-49b7-879c-33d33ad6a29f',12,'a0539b3d-865c-4b97-97ce-9bf53b97f49c',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('3a038693-4aec-4e4a-aacc-d05ec122da43',12,'df52a0ea-890f-49b6-94c3-6d9d3915afac',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('eb4abeb8-4f54-40a7-a071-28e69790cb32',11,'f82de0e4-3a6c-4111-94ea-ce2c9aaca4c8',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('d91ccbab-5778-4a0d-a2ec-e871411f026a',10,'d327049f-9802-4d3d-a482-8f45221f4c0d',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('8a2e70bb-11c9-4211-baee-aaa9a7077121',10,'d57cae4e-bde3-4868-ae6c-c3d7298a3b04',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('9c911421-61b3-4d54-8782-ec99caa3af29',10,'db40fd6f-b070-4444-97ba-f7f8765ca893',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('84c02b79-cb46-49f1-8f96-1777f40b7127',10,'b3e2b669-6a4b-485f-8a23-5b3fefc45245',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('fd0f6186-a557-475d-a96c-4f5c14d2c2a1',10,'724d15f7-58f0-4659-af03-f5972a6d86d9',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('d5a8902d-fba3-4ae0-9d87-0ecfd6c28e5c',10,'6f0ef836-cf02-4bda-920d-f4eda56ecb03',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('1017839b-e4d9-4695-b796-9ea6f0465bf2',10,'053ad9b3-10a5-4e92-ac32-4785ec180bc2',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('73992ed3-b942-49ee-bba7-50fb262670c0',9,'e0d86f81-d6cf-4cb1-8902-d89ee8c381cf',
(SELECT subject_id FROM subjects WHERE subject_name='statistics'));


INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('d15d4826-5df3-4d40-8e5d-4b42ca23bf63',12,'df52a0ea-890f-49b6-94c3-6d9d3915afac',
(SELECT subject_id FROM subjects WHERE subject_name='accounting_and_auditing'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('b9c145e7-b370-44f0-99d0-83aba907c5d8',11,'b3e2b669-6a4b-485f-8a23-5b3fefc45245',
(SELECT subject_id FROM subjects WHERE subject_name='accounting_and_auditing'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('27a4c4f9-6807-4910-8d3b-6d9ce3234564',10,'724d15f7-58f0-4659-af03-f5972a6d86d9',
(SELECT subject_id FROM subjects WHERE subject_name='accounting_and_auditing'));


INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('a7d72655-5846-474b-9ed6-f4295feb5919',12,'c9e7d892-7d39-40ba-b382-349b95d5e671',
(SELECT subject_id FROM subjects WHERE subject_name='marketing'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('b2e14456-7109-4dce-b433-a6982f717768',10,'e0d86f81-d6cf-4cb1-8902-d89ee8c381cf',
(SELECT subject_id FROM subjects WHERE subject_name='marketing'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('6b0659e1-dea0-4540-b8a6-da5a823f206d',10,'f2bdf3eb-2ff5-48f0-835d-1eada5963ca1',
(SELECT subject_id FROM subjects WHERE subject_name='marketing'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('ce9858d2-4260-4e90-8101-f953448784a0',10,'7596cf6f-1e2b-4cbe-a859-87aca6f3b667',
(SELECT subject_id FROM subjects WHERE subject_name='marketing'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('834c476e-2513-47de-815d-9ffe90d1ae6c',9,'6f0ef836-cf02-4bda-920d-f4eda56ecb03',
(SELECT subject_id FROM subjects WHERE subject_name='marketing'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('98acc474-2832-4c14-87e3-13499bd55d60',9,'053ad9b3-10a5-4e92-ac32-4785ec180bc2',
(SELECT subject_id FROM subjects WHERE subject_name='marketing'));


INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('31dae1ca-f137-4f56-b4ed-fdfb98f86a52',12,'48445d3e-409c-4611-89aa-e96257734f7e',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('46fac797-4073-4268-9d21-03be5effb14c',12,'a0539b3d-865c-4b97-97ce-9bf53b97f49c',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('c679acaf-9a97-4090-91b9-d8e3948ea65e',12,'db40fd6f-b070-4444-97ba-f7f8765ca893',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('4f80a8bb-2766-40d5-bf19-ccd93b2cc9ae',12,'724d15f7-58f0-4659-af03-f5972a6d86d9',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('62f81c11-05b8-49f1-80ee-d6b69f75cf67',12,'c9e7d892-7d39-40ba-b382-349b95d5e671',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('2eac2d4b-2d56-467c-b4f9-cf54a5a59555',11,'d327049f-9802-4d3d-a482-8f45221f4c0d',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('ff57d854-3079-41b5-8388-8af3591a17c3',11,'df52a0ea-890f-49b6-94c3-6d9d3915afac',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('36b9b12e-a2f9-4c1e-a8b5-82464e0c1a92',10,'f82de0e4-3a6c-4111-94ea-ce2c9aaca4c8',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('b28b6e04-5f8f-4171-b1f4-972d8f81c5e2',10,'d57cae4e-bde3-4868-ae6c-c3d7298a3b04',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('bb7d6e0f-c111-422b-92c9-9159c34829ba',10,'7596cf6f-1e2b-4cbe-a859-87aca6f3b667',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('08a483f5-9557-4638-a8fb-9925819f86c4',9,'b3e2b669-6a4b-485f-8a23-5b3fefc45245',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('abc5abe2-51c7-411d-aab4-14f3592dbdb0',9,'f2bdf3eb-2ff5-48f0-835d-1eada5963ca1',
(SELECT subject_id FROM subjects WHERE subject_name='psychology'));


INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('eb4d4549-37f2-471d-b5b1-0387172165c1',12,'48445d3e-409c-4611-89aa-e96257734f7e',
(SELECT subject_id FROM subjects WHERE subject_name='macroeconomics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('108b80b1-cec5-4500-ab93-f2e6c4290bbd',12,'f82de0e4-3a6c-4111-94ea-ce2c9aaca4c8',
(SELECT subject_id FROM subjects WHERE subject_name='macroeconomics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('9f013d05-adc3-4f16-8fe7-03186828d21c',12,'6f0ef836-cf02-4bda-920d-f4eda56ecb03',
(SELECT subject_id FROM subjects WHERE subject_name='macroeconomics'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('bc326289-dbb1-471b-888c-ae79c2fd4c95',11,'e0d86f81-d6cf-4cb1-8902-d89ee8c381cf',
(SELECT subject_id FROM subjects WHERE subject_name='macroeconomics'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('d1ddcd0b-9147-4aa9-9f72-3ebe0bae63a8',10,'d57cae4e-bde3-4868-ae6c-c3d7298a3b04',
(SELECT subject_id FROM subjects WHERE subject_name='macroeconomics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('f6ccf78d-2706-4a94-ae0a-8f9aa561d0d3',10,'053ad9b3-10a5-4e92-ac32-4785ec180bc2',
(SELECT subject_id FROM subjects WHERE subject_name='macroeconomics'));

INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('ba96dcd6-df58-40ff-948c-5c1ed0c3a032',9,'a0539b3d-865c-4b97-97ce-9bf53b97f49c',
(SELECT subject_id FROM subjects WHERE subject_name='macroeconomics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('97186c39-85d1-469e-9eab-ddc29f1d8ea0',9,'d327049f-9802-4d3d-a482-8f45221f4c0d',
(SELECT subject_id FROM subjects WHERE subject_name='macroeconomics'));
INSERT INTO grades (grade_id,grade_value,student_id,subject_id)
VALUES('b5ee8bdd-7039-49f2-b151-e282861c2b3c',9,'db40fd6f-b070-4444-97ba-f7f8765ca893',
(SELECT subject_id FROM subjects WHERE subject_name='macroeconomics'));
