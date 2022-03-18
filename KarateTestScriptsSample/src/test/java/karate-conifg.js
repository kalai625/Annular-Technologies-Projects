function fn() {
    var env = karate.env; // get system property 'karate.env'
    karate.log('karate.env system property was:', env);
    karate.configure('ssl', true);

    if (!env) {
        env = 'dev';
    }
    var config = {
        env: env,
        invalidAuthToken: 'dGVzdDp0ZXN0',
        baseUrl:'https://srmapiv2.azurewebsites.net/api/',
        srmApiKey: '81e1c4e3-153f-426b-8aef-1e0c85da32d8',
        tenant: 'automation',
        invalidId: 0,
        invalidIdResponse: '"Not a valid ID."'
    }
    var result = karate.callSingle('classpath:api/account/Authenticate.feature',config);
    config.authToken = result.token;
    karate.configure('headers',
        {
            'Accept': 'application/json',
            'Tenant':config.tenant,
            'SRMApiKey': config.srmApiKey,
            'Content-Type': 'application/json'
        });
    if (env == 'dev') {
        // customize
        // e.g. config.foo = 'bar';
    } else if (env == 'e2e') {
        // customize
    }

    return config;
}